// ScoreIsLessException.cs
// kbrleson

using System;

namespace Question_1
{
    public class ScoreIsLessException : Exception
    {
        public ScoreIsLessException() : base("This score is too low. You failed the exam.")
        {
        }
    }
}
