package br.com.alura;

import br.com.alura.client.ClientHttpConfiguration;
import br.com.alura.service.PetService;

import java.io.IOException;

public class ImportarPetsAbrigoCommand implements Command {

    @Override
    public void execute() {

        try {
            ClientHttpConfiguration client = new ClientHttpConfiguration();
            PetService service = new PetService(client);

            service.importaPetsAbrigo();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
