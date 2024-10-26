#include <stdio.h>
double abs(double a)
{
    if(a >= 0 ) return a;
    else return -a;
}

int main() {
    
    double a;
    
    scanf("%lf", &a);
    printf("%.10g", abs(a));
    
    return 0;
}
  