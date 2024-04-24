package com.digitalmarketing.client.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.digitalmarketing.client.model.Client;
import com.digitalmarketing.client.services.ClientServices;

@RestController
@RequestMapping("/client")
public class ClientController {
    @Autowired
    public ClientServices clientServices;

    @PostMapping("/saveclient")
    public String postMethodName(@RequestBody Client entity) {
        clientServices.postdetails(entity);
        return "saved";
    }

    @GetMapping("/getallclient")
    public List<Client> getMethodName() {
        return clientServices.get();
    }

    @GetMapping("/getclient/{customerid}")
    public Optional<Client> getMethodName(@PathVariable int customerid) {
        return clientServices.getClientById(customerid);
    }

    @DeleteMapping("/delete/{clientId}")
    public String deleteClientById(@PathVariable int clientId) {
        clientServices.deleteClientById(clientId);
        return "Deleted Successfully";
    }

    @GetMapping("/{pn}/{sz}/{name}")
    public List<Client> getName(@PathVariable("pn") int pn, @PathVariable("sz") int sz,
            @PathVariable("name") String name) {
        return clientServices.pageNationSort(pn, sz, name);
    }

}
