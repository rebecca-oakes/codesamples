`%VAT%` <- function(salary, tax){
  VAT = salary * tax/100
  return(VAT)
}

print(20000 %VAT% 75)