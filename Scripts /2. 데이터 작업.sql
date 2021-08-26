SELECT USER(), DATABASE();

desc title;

INSERT 
  INTO erp.title (code, name) 
VALUES
	(1, '사장'),
	(2, '부장'),
	(3, '과장'),
	(4, '대리'),
	(5, '사원');

SELECT *
  from title t;
 
INSERT INTO erp.employee (emp_no, emp_name, title, manager, salary, dno)
VALUES	(4377, '이성래', 1, null, 5000000, 1);

INSERT INTO erp.department
(code, name, floor)
VALUES	(1, '기획', 10);

SELECT * from department d;
SELECT * from employee e;
