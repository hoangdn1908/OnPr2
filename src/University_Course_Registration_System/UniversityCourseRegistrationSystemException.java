package University_Course_Registration_System;

import javax.crypto.spec.IvParameterSpec;

public class UniversityCourseRegistrationSystemException extends RuntimeException {
    public UniversityCourseRegistrationSystemException(String message) {
        super(message);
    }
}

class InvalidGPAException extends UniversityCourseRegistrationSystemException
{
    public InvalidGPAException(String message)
    {
        super(message);
    }
}


class CourseFullException extends UniversityCourseRegistrationSystemException
{
    public CourseFullException(String message)
    {
        super(message);
    }
}

class DuplicateStudentException extends UniversityCourseRegistrationSystemException
{
    public DuplicateStudentException(String message)
    {
        super(message);
    }
}

class InvalidEmailException extends UniversityCourseRegistrationSystemException
{
    public InvalidEmailException(String message)
    {
        super(message);
    }
}

class InvalidNameException extends UniversityCourseRegistrationSystemException
{
    public InvalidNameException(String message)
    {
        super(message);
    }
}

class InvalidIdException extends UniversityCourseRegistrationSystemException
{
    public InvalidIdException(String message)
    {
        super(message);
    }
}

class InvalidMajorException extends UniversityCourseRegistrationSystemException
{
    public InvalidMajorException(String  message)
    {
        super(message);
    }
}

class DuplicateCourseException extends UniversityCourseRegistrationSystemException
{
    public DuplicateCourseException(String message)
    {
        super(message);
    }
}

class StudentNotFoundException extends UniversityCourseRegistrationSystemException
{
    public StudentNotFoundException(String message)
    {
        super(message);
    }
}

class CourseNotFoundException extends UniversityCourseRegistrationSystemException
{
    public CourseNotFoundException(String message)
    {
        super(message);
    }
}