public class Pilha {

    public Object [] pilha;

    public int posicaoPilha;

    public Pilha(){
        this.posicaoPilha = -1; // Indicando que a pilha está vazia
        this.pilha = new Object[10]; // Criando uma pilha com 10 posições

    }

    public boolean pilhaVazia(){
        if (this.posicaoPilha == -1){
            return true;
        }
        return false;
    }

    public int tamanho (){
        if (this.pilhaVazia()){
            return 0; //Indicando que não existe nenhum item dentro da pilha
        }
        return this.posicaoPilha + 1;
        /*
            Neste return indicamos quantos itens tem dentro da pilha, somando +1
            pois a pilha inicia no zero.
         */
    }

    public void empilhar (Object valor){
        //push
        if (this.posicaoPilha < this.pilha.length -1){
            /*
                Verifica se a posicaoPilha é menor do que o tamanho da pilha, se for, então é inserido
                o valor na pilha e ao mesmo tempo é feito o incremento do atributo posiçãoPilha
             */
            this.pilha[++posicaoPilha] = valor;
        }
    }

    public Object desempilhar (){
        //pop
        if (pilhaVazia()){
            return null;
            /*
                Verificando se a pilha está vazia, se estiver não realiza nada.
             */
        }
        return this.pilha[this.posicaoPilha --];
        /*
            Retorna o que tem na última posição da pilha e decrementa 1 da posicaoPilha
         */
    }


}
