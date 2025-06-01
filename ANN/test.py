import numpy as np
import matplotlib.pyplot as plt
import pandas as pd

mean = 50
stDev = 15
val = np.random.normal(mean, stDev, size=1000)
val = np.clip(val, 5, 95)

print(min(val), max(val))

marks = np.random.normal(mean, stDev, size=(100000, 2))
marks = np.clip(marks, 5, 95)

df = pd.DataFrame(marks, columns=['SUB-1', 'SUB-2'])
df['Result'] = df.apply(lambda row: int((row > 55).any()), axis=1)
df.sample(5)
df['Result'].value_counts()

X = df.iloc[:, :2].values
Y = df.iloc[:, -1].values
print(X.shape, Y.shape)

xTrain, xTest = X[:80000, :], X[80000:, :]
print(xTrain.shape, xTest.shape)
yTrain, yTest = Y[:80000], Y[80000:]
print(yTrain.shape, yTest.shape)

# initialize parameters
def initialize(ldims):
    inputLayer = ldims[0]
    hiddenLayer = ldims[1]
    outputLayer = ldims[2]

    params = {}
    params['W0'] = np.random.randn(hiddenLayer, inputLayer)
    params['B0'] = np.zeros(hiddenLayer)
    params['W1'] = np.random.randn(outputLayer, hiddenLayer)
    params['B1'] = np.zeros(outputLayer)

    return params

def sigmoid(x):
    x = np.clip(x, -88.72, 88.72)
    z = np.exp(-x)
    return 1 / (1 + z)

def forward(x, p):
    nnState = {}
    nnState['Z1'] = np.dot(p['W0'], x.T)
    nnState['A1'] = sigmoid(nnState['Z1'])
    nnState['Z2'] = np.dot(p['W1'], nnState['A1'])
    nnState['A2'] = sigmoid(nnState['Z2'])
    return nnState

def cost(a, y):
    c = np.dot(y, np.log(a).T) + np.dot((1 - y), np.log(1 - a).T)
    return -c/y.shape[0]

def backPropagation(state, params, x, y):
    m = y.shape[0]
    dZ2 = state['A2'] - y
    dW2 = 1./m * np.dot(dZ2, state['A1'].T)
    dB2 = 1./m * np.sum(dZ2)

    dZ1 = np.dot(params['W1'].T, dZ2)
    dW1 = 1./m * np.dot(dZ1, x)
    dB1 = 1./m * np.sum(dZ1)

    return dW1, dB1, dW2, dB2

def predict(x, params):
    res = forward(x, params)
    yPred = np.array(res['A2']>0.5, dtype='int8')
    return np.squeeze(yPred)


l = [xTrain.shape[1], 3, 1]
params = initialize(l)
iters = 1000
lr = 0.01
t = []
c = []
a = []
for i in range(iters):
    nn = forward(xTrain, params)
    if i % (iters/10) == 0:
        t.append(i)
        c.append(cost(nn['A2'], yTrain))
        a.append(np.sum(predict(xTrain, params) == yTrain)/yTrain.shape[0])

    dW0, dB0, dW1, dB1 = backPropagation(nn, params, xTrain, yTrain)

    params['W0'] -= lr * dW0
    params['B0'] -= lr * dB0
    params['W1'] -= lr * dW1
    params['B1'] -= lr * dB1

plt.subplot(1, 2, 1)
plt.plot(t, c)
plt.subplot(1, 2, 2)
plt.plot(t, a)
plt.show()

# training accuracy
predTrain = predict(xTrain, params)
print(np.sum(predTrain == yTrain)/yTrain.shape[0])

# testing accuracy
predTest = predict(xTest, params)
print(np.sum(predTest == yTest)/yTest.shape[0])