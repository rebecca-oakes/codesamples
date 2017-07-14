from pyspark import SparkConf, SparkContext

def check(x):
	if x > 5:
		return True
	else:
		return False

con = SparkConf()
sc = SparkContext(conf = con)
list = [1, 2, 3, 4, 5, 6, 7, 5, 4, 5, 8, 7, 9, 1, 5, 8]
rdd1 = sc.parallelize(list)

rdd2 = rdd1.filter(check)
data = rdd2.collect()
print(data)
