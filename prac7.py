from pyspark import SparkConf, SparkContext

def add(x, y):
	return x + y

def max(x, y):
	if x > y:
		return x
	else:
		return y

con = SparkConf()
sc = SparkContext(conf = con)

list = [1, 3, 8, 7, 10, 2, 4, 5, 9, 6]
rdd = sc.parallelize(list)

data1 = rdd.reduce(add)
print(data1)

data2 = rdd.reduce(max)
print(data2)
