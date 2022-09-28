package ru.netology.repository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.data.Ticket;
import ru.netology.manager.Manager;

public class RepositoryTest {

    Repository repo = new Repository();


    Ticket ticket1 = new Ticket(1, 1000 , 60, "ALA" , "AAQ");
    Ticket ticket2 = new Ticket(2, 1500, 80, "KRR", "GZP");
    Ticket ticket3 = new Ticket(3, 200, 40, "AAQ", "KRR");
    Ticket ticket4 = new Ticket(4, 5000, 120, "ARH", "ASF");
    Ticket ticket5 = new Ticket(5, 3500, 100,"BXY", "BHX");
    Ticket ticket6 = new Ticket(6, 750, 45, " BTK", "BZK");
    Ticket ticket7 = new Ticket(7, 1300, 65, "VKT", "VOZ");
    Ticket ticket8 = new Ticket(8, 7500, 180, "VKO", "GDZ");



    @Test
    public void removeById() {
        repo.addTicket(ticket1);
        repo.addTicket(ticket2);
        repo.addTicket(ticket3);
        repo.addTicket(ticket4);
        repo.addTicket(ticket5);
        repo.addTicket(ticket6);
        repo.addTicket(ticket7);
        repo.addTicket(ticket8);

        repo.removeById(3);
        Ticket[] actual = repo.findAll();
        Ticket[] expected = new Ticket[] {
                ticket1,
                ticket2,
                ticket4,
                ticket5,
                ticket6,
                ticket7,
                ticket8
        };

        Assertions.assertArrayEquals(expected, actual);
    }


}
