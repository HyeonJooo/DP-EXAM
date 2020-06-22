package FacadeEx;

/**
 * ������� ����ý���
 * @author yun-yeoseong
 *
 */
public interface BeverageService {
    
    public void prepare();
    public void takeout();
    public void gotoTrash();
    
}
 
public class BeverageServiceImpl implements BeverageService {
 
    @Override
    public void prepare() {
        System.out.println("�����غ�");
    }
 
    @Override
    public void takeout() {
        System.out.println("�����ֱ�");
    }
 
    @Override
    public void gotoTrash() {
        System.out.println("�ٸ��� ������ ������");
    }
 
}
 
/**
 * ��ȭ���� ���� �ý���
 * @author yun-yeoseong
 *
 */
public interface MovieService {
    
    public void prepare();
    public void turnOn();
    public void turnOff();
}
 
public class MovieServiceImpl implements MovieService {
 
    @Override
    public void prepare() {
        System.out.println("��ȭ�غ�");
    }
 
    @Override
    public void turnOn() {
        System.out.println("��ȭƲ��");
    }
 
    @Override
    public void turnOff() {
        System.out.println("��ȭ����");
    }
 
}
 
 
/**
 * ��ȭ,���� �ý����� �������̽��� �ϳ��� �������̽���
 * ���Ƽ� �� ���� ���� �ý��۵��� ����� �� �ְ��Ѵ�.
 * @author yun-yeoseong
 *
 */
public interface MovieFacede {
    
    public void prepareWatchMovie();
    public void watchMovie();
    public void endMovie();
    
}
 
public class MovieFacedeImpl implements MovieFacede {
    
    private MovieService movieService;
    private BeverageService beverageService;
    
    public MovieFacedeImpl(MovieService movieService,BeverageService beverageService) {
        
        this.movieService=movieService;
        this.beverageService=beverageService;
        
    }
    
    @Override
    public void prepareWatchMovie() {
        
        beverageService.prepare();
        beverageService.takeout();
        movieService.prepare();
        
    }
 
    @Override
    public void watchMovie() {
        
        movieService.turnOn();
        
    }
 
    @Override
    public void endMovie() {
        
        movieService.turnOff();
        beverageService.gotoTrash();
        
    }
 
}
