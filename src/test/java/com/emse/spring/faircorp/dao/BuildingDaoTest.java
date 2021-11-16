package com.emse.spring.faircorp.dao;

import com.emse.spring.faircorp.model.Heater;
import com.emse.spring.faircorp.model.Window;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

@ExtendWith(SpringExtension.class)
@DataJpaTest
public class BuildingDaoTest {

    @Autowired
    private BuildingDao buildingDao;

    @Test
    public void shouldFindAllWindows() {
        List<Window> windows = buildingDao.findWindowBuilding(1L);
        Assertions.assertThat(windows.size()).isEqualTo(4);
    }

    @Test
    public void shouldFindAllHeaters() {
        List<Heater> heaters = buildingDao.findHeaterBuilding(1L);
        Assertions.assertThat(heaters.size()).isEqualTo(2);
    }

}