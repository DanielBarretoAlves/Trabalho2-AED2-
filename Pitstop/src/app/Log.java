package app;

public class Log {
    
    private Ticket[] Tickets;
    private String logContent;

    public Log()
    {
        logContent = "";
    }


    public void generateTickets(int qtd)
    {

    }

    public Room[] generateRooms(int num)
    {
        Room[] Rooms = new Room[num];

        for (int i = 0; i < Rooms.length; i++) {
            Room r = new Room();
        }
        return Rooms;

    }

    //TODO: Montar estrutura da Pilha e add um metodo que recebe como parametro as Rooms e lá seta as Rooms em cada Ticket existente
    //TODO: qunado der o set Room na pilha se o Room r add for true vai dar uma set Room no ticket se n vai pra proxima room se chegar no limite para e retorna uma mensagem para o log
}