
#include <stdio.h>

int main()
{
    printf("*********\n");
    printf("BEM-VINDO\n");
    printf("*********\n");

    int numero_secreto = 2;
    int chute;
    int tentativas = 5;
    
    while (chute != numero_secreto) {
    printf("\nQual é o número secreto?: ");
    scanf("%d", &chute);
    
    if(tentativas == 1){
        printf("Você excedeu o número de tentativas, o número secreto era %d.", numero_secreto);
        break;
    }
    
    if(chute == numero_secreto){
        printf("Correto! O número secreto era %d", numero_secreto);
        tentativas = tentativas - tentativas;
        break;
    } else {
        printf("Não foi desta vez!\n");
        tentativas -= 1;
        if(chute > numero_secreto){
            printf("Seu chute e maior que o número secreto, tente novamente.\n");
            printf("Tentativas: %d\n.", tentativas);
        } else {
            printf("Seu chute e menor, que o número secreto, tente novamente.");
            printf("Tentativas: %d\n.", tentativas);
        }
    };
};
    return 0;
}
