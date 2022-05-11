package chapters.chapter3;

//Հաշվել լույսի անցած ճանապարհը կիրառելով long փոփոխականները
public class LongExample {
    public static void main(String[] args) {

        int lightSpeed = 186000;
        long days = 1000;
        long seconds = days * 24 * 60 * 60;
        long distance = lightSpeed * seconds;
        //լույսի մոտավոր արագությունը վրկ–ում միլերով

        System.out.print("In " + days + "  days the light will travel about " + distance + " miles.");
    }
}
