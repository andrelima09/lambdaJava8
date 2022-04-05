package treinamento;

public class Lambda {

    public static void main(String[] args) {

        //Lambdas só funcionam no conceito SAM (Single Abstract Method)
        //SAM -> Refere-se a uma interface que tenha somente 1 método abstrato.


        //Aqui temos a função como é escrita em Java < 8

        new Thread(new Runnable() {

            @Override
            public void run() {
                System.out.println("Hello World!");
            }
        }).run();


        //Aqui o mesmo código é escrito em expressão lambda.
        //A primeiro parte "() ->" refere-se aos paremostros do método run() que no caso não tem nada
        //A segunda parte "System.out.println...." refere-se a implementação do metodo run().

        new Thread(() -> System.out.println("Hello World!")).run();

        //Isso só é possível pq o Java já sabe que vai ser o metodo "run()" chamado, pois só existe ele na interface Runnable.

    }

}
