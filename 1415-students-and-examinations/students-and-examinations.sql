# Write your MySQL query statement below
SELECT s1.student_id, 
       s1.student_name, 
       s.subject_name, 
       COUNT(e.student_id) AS attended_exams
FROM students AS s1
CROSS JOIN subjects  AS s
LEFT JOIN examinations AS e
  ON s1.student_id = e.student_id AND s.subject_name = e.subject_name
GROUP BY s1.student_id, s1.student_name, s.subject_name
 
ORDER BY s1.student_id , s.subject_name;
