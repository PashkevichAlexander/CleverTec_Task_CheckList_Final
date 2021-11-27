package task.service;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import task.exception.XMLRepositoryException;
import task.repository.impl.XMLRepository;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class XMLRepositoryTest {


    private static Stream<Arguments> provideValueForXMLReadFile_SuccessfullyRead() {
        return Stream.of(
                Arguments.of(1, "src/test/resources/noFile.xml"),
                Arguments.of(1, "src/test/resources/repository-test.xml")
        );
    }

    @ParameterizedTest
    @MethodSource("provideValueForXMLReadFile_SuccessfullyRead")
    public void XMLReadFile_SuccessfullyRead(int id, String filepath) {
        XMLRepository repository = new XMLRepository(filepath);
        assertThrows(XMLRepositoryException.class, () -> repository.find(id));
    }

}
