package Exercício12;

    public class Elevador {
        //Variaveis globais
        private int nAtual, nTotal, nCapac, nPessoas;

        //Classe principal
        Elevador(int nA, int nT, int nC, int nP) {
            this.nAtual   = nA;
            this.nTotal   = nT;
            this.nCapac   = nC;
            this.nPessoas = nP;
        }

        //Get - Capacidade
        int getCapac()    {
            return this.nCapac;}
        //Get - Pessoas presentes
        int getPessoas()    {
            return this.nPessoas;}
        //Get - Total de andares
        int getTotal()    {
            return this.nTotal;}
        //Get - Andar Atual
        int getAtual()    {
            return this.nAtual;}

        //Set - Pessoas Presentes
        void setPes(int nPe){
            this.nPessoas = nPe;}

        //Inicializa
        void Inicializa(int nCap, int nTot){
            this.nTotal   = nTot;
            this.nCapac   = nCap;
        }

        //Entra pessoa
        void Entra(){
            this.nPessoas+=1;
        }

        //Sai pessoa
        void Sai(){
            this.nPessoas-=1;
        }

        //Sobe de andar
        void Sobe(){
            this.nAtual+=1;
        }

        //Desce de andar
        void Desce(){
            this.nAtual-=1;
        }

    }

