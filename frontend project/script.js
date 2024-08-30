document.addEventListener('DOMContentLoaded', () => {
    const registrationForm = document.getElementById('registration-form');
    const examForm = document.getElementById('exam-form');
    const studentList = document.getElementById('student-list');
    const examList = document.getElementById('exam-list');

    registrationForm.addEventListener('submit', (event) => {
        event.preventDefault();

        const name = document.getElementById('student-name').value;
        const studentId = document.getElementById('student-id').value;
        const email = document.getElementById('student-email').value;

        const li = document.createElement('li');
        li.textContent = `Name: ${name}, ID: ${studentId}, Email: ${email}`;
        studentList.appendChild(li);

        registrationForm.reset();
    });

    examForm.addEventListener('submit', (event) => {
        event.preventDefault();

        const examName = document.getElementById('exam-name').value;
        const examDate = document.getElementById('exam-date').value;
        const studentId = document.getElementById('student-id-exam').value;
        const grade = document.getElementById('exam-grade').value;

        const li = document.createElement('li');
        li.textContent = `Exam: ${examName}, Date: ${examDate}, Student ID: ${studentId}, Grade: ${grade}`;
        examList.appendChild(li);

        examForm.reset();
    });
});