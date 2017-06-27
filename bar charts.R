os <- OrchardSprays 

boxplot(decrease ~ treatment, data = os, xlab = "Treatments", ylab = "Decrease", main = "OrchardSprays", col = c('blue', 'red', 'blue', 'red', 'blue', 'red', 'blue', 'red'), border = 'darkgreen')

ggplot(OrchardSprays[1],aes(OrchardSprays$treatment, OrchardSprays[1]))+geom_boxplot()#+geom_step()

ggplot(OrchardSprays[1],aes(OrchardSprays$treatment, OrchardSprays$decrease))+geom_boxplot(colour='blue',fill='lightblue')+ggtitle(paste('Max decrease is treatment:',OrchardSprays[OrchardSprays$decrease==max(OrchardSprays$decrease),'treatment']))+geom_point(aes(colour=factor(OrchardSprays$decrease)))+labs(x = "Treatments", y = "Levels of Decrease")+ guides(colour=FALSE)
