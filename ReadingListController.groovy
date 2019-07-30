@Controller
@RequestMapping("/")
class ReadingListController {

    String reader = "yjjung"

    @Autowired
    ReadingListRepository readingListRepository // ReadingListRepository 주입

    @RequestMapping(method=RequestMethod.GET)
    def readersBooks(Model model) {
        // 독서 목록 조회
        List<Book> readingList = readingListRepository.findByReader(reader)   
        if(readingList) {
            // 모델에 추가
            model.addAttribute("books", readingList)
        }
        model.addAttribute("reader", reader)
        "readingList"   // 뷰 이름 반환
    }

    @RequestMapping(method=RequestMethod.POST)
    def addToReadingList(Book book) {
        book.setReader(reader)
        readingListRepository.save(book)    // 책 저장
        "redirect:/"    // POST 후 리다이렉트
    }

}