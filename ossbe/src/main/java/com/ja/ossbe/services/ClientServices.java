package com.ja.ossbe.services;

import com.ja.ossbe.dao.ClientRepository;
import com.ja.ossbe.entities.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientServices  implements IClientServices{
    @Autowired
    private ClientRepository clientRepository;

    @Override
    public Client saveClient(Client client) {
        clientRepository.save(client);
        return client;
    }

    @Override
    public Client getClient(Integer id){
        return clientRepository.findById(id).get();
    }
}
