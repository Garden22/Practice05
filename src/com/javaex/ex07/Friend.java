package com.javaex.ex07;

public class Friend {
	//필드
    private String name;
    private String hp;
    private String school;
    
   
    // getter/setter 작성
	public void setName(String name) {
		this.name = name;
	}

	public void setHp(String hp) {
		this.hp = hp;
	}

	public void setSchool(String school) {
		this.school = school;
	}
	
	
    // 메서드
    public void showInfo() {
        System.out.println("이름:"+name+"  핸드폰:"+hp+"  학교:"+school);
    }

}
