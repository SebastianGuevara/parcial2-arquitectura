package co.edu.unisabana.parcial.service;

import co.edu.unisabana.parcial.controller.dto.CheckpointDTO;
import co.edu.unisabana.parcial.repository.sql.jpa.CheckpointRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class CheckpointServiceTest {
    @Mock
    private CheckpointRepository repository;

    @InjectMocks
    private CheckpointService service;

    @Test
    public void Given_a_checkin_with_invalid_month_When_invokin_chekin_Then_trhow_exception(){
        CheckpointDTO dto = new CheckpointDTO("Input","Featur",50);
        Assertions.assertThrows(IllegalArgumentException.class,()->service.checkin(dto));
    }

    @Test
    public void Given_a_checkin_with_invalid_month_When_invokin_chekout_Then_trhow_exception(){
        CheckpointDTO dto = new CheckpointDTO("Input","Featur",50);
        Assertions.assertThrows(NullPointerException.class,()->service.checkout(dto));
    }
}
