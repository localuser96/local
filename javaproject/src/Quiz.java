
public class Quiz {//문제 정의
	
	private String quiz;
	private String answer;
	
	public Quiz(){
		
	}
	
	public Quiz(String quiz,String answer) {
		this.quiz = quiz;
		this.answer = answer;
	}
	
	public String getQuiz() {
		return quiz;
	}
	
	public String getAnswer() {
		return answer;
	}

}
