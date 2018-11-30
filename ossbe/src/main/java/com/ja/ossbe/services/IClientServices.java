package com.ja.ossbe.services;

import com.ja.ossbe.entities.Client;

public interface IClientServices {
    public Client saveClient(Client client);
    public Client getClient(Integer id);
}
