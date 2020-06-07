package app;

public class Main {

    public static void main(String[] args) {

        Queue q = new Queue();
        Person p = new Person("Daniel");
        Person p2 = new Person("John");
        q.addElement(p);
        q.addElement(p2);
        System.out.println(q);
        System.out.println("Removing.. " + q.getFirst().getNome());
        q.remove();
        System.out.println(q);

    }
}

// =================================================================================================
// MANUAL DE INSTRUÇÃO DA QUEUE F:
// OBS: A FILA NO CONTRUTOR DEVE TER UM TAMANHO ESPCEIFICO (capacity)
// SELECIONADO CASO..
// ..CONTRARIO O TAMANHO PADÃO SERÁ 10

// F GETSIZE() RETONA O TAMANHO DA FILA EM INT
// F.GETFIRST() RETORNA O PRIMEIRO ELEMENTO DA FILA.
// F.REMOVE() REMOVE UM ELEMENTO DA FILA.
// F.ADDELEMENT(PERSON) ADD UM OBJETO DO TIPO PERSON NA FILA.(REQUER UMA
// PERSON..
// ..CRIADA PARA ADD NA FILA).
// METODO TO STRING CRIADO ELE MOSTRA O NOME E A POSIÇÃO DE TODOS DA FILA
// =================================================================================================
