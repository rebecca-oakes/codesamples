from pyspark import SparkConf, SparkContext

con = SparkConf()
sc = SparkContext(conf = con)

list = [1, 2, 3, 3, 2, 1, 1, 3, 4, 5, 4, 2, 2, 1, 2, 2, 3, 1]
rdd = sc.parallelize(list)
num = rdd.count()
data = rdd.countByValue()

for d in data:
	print(d, "-", data[d])
