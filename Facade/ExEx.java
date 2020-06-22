package FacadeEx;

/**
 * 음료관련 서브시스템
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
        System.out.println("음료준비");
    }
 
    @Override
    public void takeout() {
        System.out.println("음료주기");
    }
 
    @Override
    public void gotoTrash() {
        System.out.println("다먹은 음료컵 버리기");
    }
 
}
 
/**
 * 영화관련 서브 시스템
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
        System.out.println("영화준비");
    }
 
    @Override
    public void turnOn() {
        System.out.println("영화틀기");
    }
 
    @Override
    public void turnOff() {
        System.out.println("영화끄기");
    }
 
}
 
 
/**
 * 영화,음료 시스템의 인터페이스를 하나의 인터페이스로
 * 몰아서 더 쉽게 서브 시스템들을 사용할 수 있게한다.
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
