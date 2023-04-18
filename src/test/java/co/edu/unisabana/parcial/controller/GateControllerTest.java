package co.edu.unisabana.parcial.controller;

import co.edu.unisabana.parcial.AbstractTest;
import co.edu.unisabana.parcial.controller.dto.CheckpointDTO;
import co.edu.unisabana.parcial.controller.dto.ResponseGate;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class GateControllerTest extends AbstractTest {
    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void Given_a_exception_When_invoking_chekin_Then_capture_exception(){
        String path = "/checkpoint/checkin";
        CheckpointDTO dto = new CheckpointDTO("Facility","Driver",203);
        ResponseEntity<ResponseGate> responseEntity = restTemplate.postForEntity(path,dto,ResponseGate.class);
        Assertions.assertEquals(HttpStatus.OK,responseEntity.getStatusCode());
    }
    @Test
    public void Given_a_checkpoint_When_invoking_chekin_Then_ok(){
        String path = "/checkpoint/checkin";
        CheckpointDTO dto = new CheckpointDTO("Facility","Driver",23);
        ResponseEntity<ResponseGate> responseEntity = restTemplate.postForEntity(path,dto,ResponseGate.class);
        Assertions.assertEquals(HttpStatus.OK,responseEntity.getStatusCode());
    }

    @Test
    public void Given_a_checkpoint_When_invoking_chekin_checkout_Then_ok(){
        String path = "/checkpoint/checkout";
        CheckpointDTO dto = new CheckpointDTO("Facility","Driver",23);
        ResponseEntity<ResponseGate> responseEntity = restTemplate.postForEntity(path,dto,ResponseGate.class);
        Assertions.assertEquals(HttpStatus.OK,responseEntity.getStatusCode());
    }
    @Test
    public void Given_a_checkpoint_When_invoking_checkout_Then_ok(){
        String path = "/checkpoint/checkout";
        CheckpointDTO dto = new CheckpointDTO("Facility","Driver",23);
        ResponseEntity<ResponseGate> responseEntity = restTemplate.postForEntity(path,dto,ResponseGate.class);
        Assertions.assertEquals(HttpStatus.OK,responseEntity.getStatusCode());
    }
    @Test
    public void Given_an_exception_When_invoking_checkout_Then_ok(){
        String path = "/checkpoint/checkout";
        CheckpointDTO dto = new CheckpointDTO("Facility","Driver",203);
        ResponseEntity<ResponseGate> responseEntity = restTemplate.postForEntity(path,dto,ResponseGate.class);
        Assertions.assertEquals(HttpStatus.OK,responseEntity.getStatusCode());
    }
}
