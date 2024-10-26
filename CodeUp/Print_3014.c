# include <stdio.h> 
# include <stdlib.h> 

int main() 
{ 
    int number; 
    int time;
    int max = 0;

    int *data = (int*)calloc(100000, sizeof(int)); 

    scanf("%d",&time); 

    for(int i = 0; i<time; i++) 
    { 
        scanf("%d",&number); 
        data[number]++; 
        if(number > max) max = m; 
    } 
    
    for(int i = 0; i<=max; i++) 
    { 
        for(int j = 0; j<data[i]; j++) 
        { 
            printf("%d ",i); 
        } 
        
    } 
    return 0; 
    
}