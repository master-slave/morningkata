/**
 * @author <a href="mailto:slavisa.avramovic@escriba.de">avramovics</a>
 * @since 2018-11-30
 */
public class WordCount {

  public void count(String text) {
    String[] split = text.split("[ |\n]");
    System.out.println(split.length);
  }
  public static void main(String[] args) {
    String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. In aliquet mollis sapien sit amet iaculis. Nam et nisl justo. Nulla euismod diam ut risus maximus, in hendrerit ante laoreet. Ut molestie erat vel augue tincidunt, at interdum lorem fringilla. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Ut velit justo, molestie eu laoreet ac, dignissim sit amet ligula. Aenean at tortor metus. Suspendisse eget risus ex. Morbi et accumsan enim, sit amet condimentum ante.\n"
        + "Pellentesque aliquam ultrices imperdiet. Maecenas aliquam cursus nibh, sed laoreet diam pulvinar sed. Integer nec pharetra ex, a tristique nunc. Vestibulum egestas mi pharetra sapien sollicitudin finibus. Pellentesque et purus lectus. Proin auctor metus a mauris aliquam, consequat pharetra orci dictum. Donec volutpat est vitae purus finibus dignissim et ut arcu. Mauris quis dictum leo. Aliquam vulputate hendrerit libero eu rutrum. Suspendisse facilisis condimentum fermentum.\n"
        + "Pellentesque felis arcu, tincidunt vitae lectus vitae, aliquam mattis nunc. Vivamus vitae erat eu libero facilisis rhoncus a nec nunc. Donec vehicula felis pellentesque viverra sagittis. Maecenas dictum lacus eu odio fringilla, non suscipit tortor facilisis. Donec tempus quis quam a aliquet. Morbi ex enim, vulputate nec nulla non, semper accumsan turpis. Maecenas nec nibh non tellus rutrum malesuada at id justo. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Quisque semper rutrum ipsum. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Phasellus tincidunt, massa non varius mattis, orci urna pulvinar urna, lacinia feugiat neque diam id nunc.\n"
        + "Maecenas non mauris in eros ultricies pretium eu quis nulla. Nunc consectetur ornare interdum. Nulla in semper ligula. Praesent ut feugiat risus, eu tincidunt eros. Sed cursus tellus sit amet consectetur accumsan. Phasellus leo purus, facilisis vel ex sed, tempus faucibus turpis. Ut sollicitudin hendrerit dolor, ac finibus libero facilisis ut. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Etiam in dictum velit. Mauris sed ultrices leo. Integer at libero a sapien vehicula porttitor nec vitae enim. Donec mattis magna eget laoreet tincidunt.\n"
        + "Nam condimentum malesuada tortor, nec hendrerit dolor posuere id. Fusce finibus arcu sed laoreet suscipit. Aliquam ornare auctor feugiat. Suspendisse porttitor diam vel sollicitudin mollis. Donec at finibus dolor, sed aliquet odio. Fusce mollis felis id odio dictum lobortis. Vestibulum vestibulum aliquet facilisis. Donec eget enim metus. Aenean sodales massa nisi, consectetur convallis quam mollis eget. Vestibulum tristique maximus elementum. Phasellus varius sapien diam, vel tristique nulla finibus sed.\n";

    System.out.println("Expecting Generated 5 paragraphs, 421 words, 2910 bytes of Lorem Ipsum");

    WordCount wc = new WordCount();
    wc.count(text);
  }
}
