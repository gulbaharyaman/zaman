package zaman;

public class Time {
	private int hour;
	private int minute;
	private int second;
	
	public void setTime(int h,int m,int s) {
		if((h>=0&&h<24)&&(m>=0&&m<60)&&(s>=0&&s<60)) {
			hour=h;
			minute=m;
			second=s;
		}
		else {
			throw new IllegalArgumentException("hour,minute and/or second was out of range");
		}
	}
	public String toUniversalString() {
		return String.format("%02d:%02d:%02d",hour,minute,second);
	}
    public String toStandardString() {
    	return String.format("%d:%02d%02d",((hour==0||hour==12)?12:hour%12),minute,second,
    			(hour<12?"am":"pm"));
    }
}
