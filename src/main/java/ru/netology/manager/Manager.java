package ru.netology.manager;

import ru.netology.data.Ticket;
import ru.netology.repository.Repository;

import java.util.Arrays;

public class Manager {
    protected Repository repo;

    public Manager(Repository repo) {
        this.repo = repo;
    }

    public void addTicket(Ticket ticket) {
        repo.addTicket(ticket);
    }
    public void removeById(int id) {
        repo.removeById(id);
    }

    public Ticket[] findAll(String airportFrom, String airportTo) {
        Ticket[] result = new Ticket[0];
        for (Ticket ticket : repo.findAll()) {
            if (matches(ticket , airportFrom, airportTo)) {
                Ticket[] tmp = new Ticket[result.length + 1];
                for (int i = 0; i < result.length; i++) {
                    tmp[i] = result[i];
                }
                tmp[tmp.length - 1] = ticket;
                result = tmp;
            }
        }
        Arrays.sort(result);
        return result;
    }

    public boolean matches(Ticket ticket, String airportFrom, String airportTo) {
        if (ticket.getAirportFrom() .equals(airportFrom)) {
            if (ticket.getAirportTo() .equals(airportTo)) {
                return true;
            }
        }
        return false;
    }


}
