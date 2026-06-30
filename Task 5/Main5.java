class UniversityMember {

    public void attendLecture() {
        System.out.println("Attending a lecture.");
    }
}

interface Researcher {
    void conductLabResearch();
}

class UndergraduateStudent extends UniversityMember {
}

class GraduateResearchAssistant extends UniversityMember implements Researcher {

    @Override
    public void conductLabResearch() {
        System.out.println("Publishing papers and running experiments.");
    }
}

class Professor extends UniversityMember implements Researcher {

    @Override
    public void conductLabResearch() {
        System.out.println("Publishing papers and running experiments.");
    }
}

public class task5 {
    public static void main(String[] args) {

        UndergraduateStudent student = new UndergraduateStudent();
        student.attendLecture();

        GraduateResearchAssistant gra = new GraduateResearchAssistant();
        gra.attendLecture();
        gra.conductLabResearch();

        Professor professor = new Professor();
        professor.attendLecture();
        professor.conductLabResearch();
    }
}
