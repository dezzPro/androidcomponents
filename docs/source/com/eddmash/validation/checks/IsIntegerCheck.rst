.. java:import:: android.widget EditText

.. java:import:: android.widget Spinner

IsIntegerCheck
==============

.. java:package:: com.eddmash.validation.checks
   :noindex:

.. java:type:: public class IsIntegerCheck extends NotEmptyCheck

   Check if value is an integer.

Constructors
------------

.. java:constructor:: public IsIntegerCheck(EditText view, String errorMessage)
   :outertype: IsIntegerCheck

.. java:constructor:: public IsIntegerCheck(Spinner spinner, String errorMessage)
   :outertype: IsIntegerCheck

Methods
-------

.. java:method:: @Override public String getErrorMsg()
   :outertype: IsIntegerCheck

.. java:method:: @Override public boolean run()
   :outertype: IsIntegerCheck

