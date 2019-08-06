/*
import org.springframework.test.web.servlet.MockMvc
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*
import static org.mockito.Mockito.*


// JUnit test

// 실행방법
// $ spring test 
// -> Spring boot 2.0부터는 CLI테스트 삭제 (https://github.com/spring-projects/spring-boot/wiki/Spring-Boot-2.0-Migration-Guide)

class ReadingListControllerTest {

    @Test
    void shouldReturnReadingListFromRepository() {
        // controller에 GET 요청을 보내려고 스프링의 MockMVC 테스트 지원을 사용

        List<Book> expectedList = new ArrayList<Book>()
        expectedList.add(new Book(
            id: 1,
            reader: yjjung,
            isbn: "9781517385",
            title: "Spring Boot in Action",
            author: "Craig Walls",
            description: "Spring Boot in Action is ..."
        ))

        def mockRepo = mock(ReadingListRepository.class)    // 목(Mock) ReadingListRepository
        when(mockRepo.findByReader("yjjung")).thenReturn(expectedList)
        def controller = new ReadingListController(readingListRepository: mockRepo)

        MockMvc mvc = standaloneSetup(controller).build()
        mvc.perform(get("/"))
            .andExpect(view().name("readingList"))
            .andExpect(model().attribute("books", expectedList))
    }
}
*/