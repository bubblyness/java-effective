public class Stream {
    public static void main(String[] args) throws Exception {

        List<String> names = Arrays.asList("김코딩", "이자바", "백해커", "김코딩", "박해커");

        names.stream()
                .distinct() // 중복제거
                .forEach(element -> System.out.println(element));
        System.out.println();

        names.stream()
                .filter(element -> element.startsWith("김")) //김씨 성만 필터
                .forEach(element -> System.out.println(element));
        System.out.println();

        names.stream()
                .distinct()
                .filter(element -> element.startsWith("김"))
                .forEach(element -> System.out.println(element));
    }
}
