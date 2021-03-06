.. java:import:: android.util Log

.. java:import:: android.widget CheckBox

.. java:import:: android.widget CompoundButton

.. java:import:: android.widget EditText

.. java:import:: android.widget Spinner

.. java:import:: android.widget TextView

.. java:import:: android.widget Toast

.. java:import:: java.util Objects

NotEmptyCheck
=============

.. java:package:: com.eddmash.validation.checks
   :noindex:

.. java:type:: public class NotEmptyCheck extends CheckSingle

   Ensure the view if not blank.

Fields
------
errorMessage
^^^^^^^^^^^^

.. java:field:: protected String errorMessage
   :outertype: NotEmptyCheck

Constructors
------------
NotEmptyCheck
^^^^^^^^^^^^^

.. java:constructor:: public NotEmptyCheck(EditText editText, String errorMessage)
   :outertype: NotEmptyCheck

NotEmptyCheck
^^^^^^^^^^^^^

.. java:constructor:: public NotEmptyCheck(Spinner spinner, String errorMessage)
   :outertype: NotEmptyCheck

NotEmptyCheck
^^^^^^^^^^^^^

.. java:constructor:: public NotEmptyCheck(CompoundButton compoundButton, String errorMessage)
   :outertype: NotEmptyCheck

Methods
-------
getErrorMsg
^^^^^^^^^^^

.. java:method:: @Override public String getErrorMsg()
   :outertype: NotEmptyCheck

getValue
^^^^^^^^

.. java:method:: @Override public String getValue()
   :outertype: NotEmptyCheck

getView
^^^^^^^

.. java:method:: @Override protected TextView getView()
   :outertype: NotEmptyCheck

   Gets the editText we are working on.

run
^^^

.. java:method:: @Override public boolean run()
   :outertype: NotEmptyCheck

