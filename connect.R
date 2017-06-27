install.packages("RODBC")
require('RODBC')

dx <- odbcConnect('qaDriver', uid = 'root', pwd = 'Pa$$w0rd')
df <- sqlQuery(dx, 'SELECT * FROM qa')
print(df)
