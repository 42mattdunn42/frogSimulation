# Matt Dunn, 11-3-21
# Simulation for frog problem
# Video: https://www.youtube.com/watch?v=ZLTyX4zL2Fc
import random


def averageArr(x):
    total = 0
    for num in x:
        total += num
    return total / len(x)


def simulation(numPads, numTimes):
    data = []
    for i in range(numTimes):
        padsTraversed = 0
        count = 0
        while padsTraversed < numPads:
            padsTraversed += random.randint(1, numPads - padsTraversed)
            count += 1
        data.append(count)
    return averageArr(data)


def main():
    file = open("output.txt", "w")
    numTrials = 100000
    data = []
    for i in range(1, 101):
        data.append(simulation(i, numTrials))
    print(data)
    for x in data:
        temp = str(x) + ',' + "\n"
        file.write(temp)


if __name__ == '__main__':
    main()
