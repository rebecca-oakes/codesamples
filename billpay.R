bill <- as.numeric(readline("How much is to be paid?:"))
pay <- as.numeric(readline("How much has customer paid?:"))
change <- pay - bill
change <- change * 100
notes <- INT(change/100)
coins <- change %% 100
money <- calculate(notes, coins)
display(bill, pay, money)

calculate <- function(notes, coins){
  change <- list(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
  while(notes > 0){
    if(notes >= 50){
      change[1] <- change[1] + 1
      notes <- notes - 50
    }
    else if(notes >= 20){
      change[2] <- change[2] + 1
      notes <- notes - 20
    }
    else if(notes >= 10){
      change[3] <- change[3] + 1
      notes <- notes - 10
    }
    else if(notes >= 5){
      change[4] <- change[4] + 1
      notes <- notes - 5
    }
    else if(notes >= 2){
      change[5] <- change[5] + 1
      notes <- notes - 2
    }
    else if(notes >= 1){
      change[6] <- change[6] + 1
      notes <- notes - 1
    }
  }
  while(coins > 0){
    if(coins >= 50){
      change[7] <- change[7] + 1
      coins <- coins - 50
    }
    else if(coins >= 20){
      change[8] <- change[8] + 1
      coins <- coins - 20
    }
    else if(coins >= 10){
      change[9] <- change[9] + 1
      coins <- coins - 10
    }
    else if(coins >= 5){
      change[10] <- change[10] + 1
      coinss <- coins - 5
    }
    else if(coins >= 2){
      change[11] <- change[11] + 1
      coins <- coins - 2
    }
    else if(coins >= 1){
      change[12] <- change[12] + 1
      coins <- coins - 1
    }
  }  
  return (change)
}

display <- function(bill, pay, change){
  disArr <- list("£50", "£20", "£10", "£5", "£2", "£1", "50p", "20p", "10p", "5p", "2p", "1p")
  print(paste("The bill is £", bill))
  print(paste("The amount given was £", pay))
  print("The change to give is:")
  for(c in change){
    if(change[c] != 0){
      print(paste("The customer needs to get ", change[c], " ", disArr[c], " back"))
    }
  }
  wordDisplay(change)
}
wordDisplay <- function(change){
  numbers <- list("one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten")
}
