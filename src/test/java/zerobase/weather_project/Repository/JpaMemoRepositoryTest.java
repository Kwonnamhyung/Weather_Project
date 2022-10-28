package zerobase.weather_project.Repository;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;
import zerobase.weather_project.domain.Memo;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class JpaMemoRepositoryTest {

    @Autowired
    private JpaMemoRepository jpaMemoRepository;

    @Test
    void insertMemoTest(){

        Memo memo = new Memo(1 , "test Memo");
        jpaMemoRepository.save(memo);

        List<Memo> result = jpaMemoRepository.findAll();
        assertTrue(result.size() > 0);
    }

    @Test
    void findById(){

        Memo memo = new Memo(1 , "test Memo");
        Memo saveMemo = jpaMemoRepository.save(memo);

        Optional<Memo> result = jpaMemoRepository.findById(saveMemo.getId());

        Assertions.assertThat(result.get().getText()).isEqualTo("test Memo");

    }

}