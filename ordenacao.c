#include<stdio.h>

int verifica(int v[],n);
int exibe(int v[],n);

int main(){

    int n;

    printf("Informe o tamanho do vetor:\n");
    scanf("%d", &n);

    int v[n];

    for (int i=0; i<n;i++){
        v[i] = random(10*n);
    }
    
    exibe (&v, n);  
    verifica(&v, n);
    exibe (&v, n); 

 return 0;
}

int verifica (int v[], int n){
        if (n > 1) {
            for (int i = 1; i < n; i++){ 
                if (v[i-1] > v[i]) return 0; 
                return 1;
            }; 
        };
    
};

int exibe(int v[], int n){
    for(int i=0; i<n; i++){
        printf("%d\t", v[i]);
    }
}