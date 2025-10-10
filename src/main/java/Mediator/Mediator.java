package Mediator;

 interface Mediator
{
    void sendMessage(String message, Colleague colleague);
    void addColleague(Colleague colleague);
    void removeColleague(Colleague colleague);
}
