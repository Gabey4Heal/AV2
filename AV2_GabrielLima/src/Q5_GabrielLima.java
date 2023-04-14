import  java.util.Scanner;

public class Q5_GabrielLima {
    
    public static void main(String[] args) {
        String fileName = "file.txt"; // nome do arquivo a ser lido
        List<String> linkWords = findLinkWords(fileName); // lista de palavras com a subsequência "link"
        System.out.println(linkWords);
    }
    
    public static List<String> findLinkWords(String fileName) {
        List<String> linkWords = new ArrayList<String>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+"); // separa as palavras da linha pelo espaço em branco
                for (String word : words) {
                    if (word.contains("link")) {
                        linkWords.add(word);
                    }
                }
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return linkWords;
    }
}