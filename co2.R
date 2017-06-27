print(class(CO2$Plant))
mean_uptake <- mean(CO2$uptake)

boxplot(uptake ~ Type, data = CO2, xlab = 'Location', ylab = 'Uptake', main = 'Uptake in certain cities')

CO2_Q <- CO2[CO2$Type == 'Quebec',]
CO2_M <- CO2[CO2$Type == 'Mississippi',]

mean_checker <- function(v1, v2){
  mean_v1 <- mean(v1$uptake)
  mean_v2 <- mean(v2$uptake)
  
  if(mean_v1 > mean_v2){
    return (v1$Type[1])
  }
  else{
    return (v2$Type[1])
  }
}

print(mean_checker(CO2_Q, CO2_M))
