package javapdfpractice;

/**
 * You can link to the javadoc of an already imported class using {@link ClassName}.
 *
 * You can also use the fully-qualified name, if the class is not already imported:
 * {@link some.other.ClassName}
 *
 * You can link to members (fields or methods) of a class like so:
 * {@link ClassName#someMethod()}
 * {@link ClassName#someMethodWithParameters(int, String)}
 * {@link ClassName#someField}
 * {@link #someMethodInThisClass()} - used to link to members in the current class
 * 
 * You can add a label to a linked javadoc like so:
 * {@link ClassName#someMethod() link text}
 * 
 * 
 * 
 */

public class VarArgs {
	/**
	 * Fields can be documented as well.
	 *
	 * As with other javadocs, the documentation before the first period is used as a
	 * summary, and is usually separated from the rest of the documentation by a blank
	 * line.
	 *
	 * Documentation for fields can use inline tags, such as:
	 * {@code code here}
	 * {@literal text here}
	 * {@link <a href="stanck.com">Stack Overflow</a>}
	 *
	 * Field documentation can also make use of the following tags:
	 *
	 * @since 2.1.0
	 * @see some.other.class.Documentation
	 * @deprecated dhkj
	 */
	public static final int a=30;
	/**
	 * 
	 * @param varargs
	 * @return
	 * @
	 */
	public static void main(String...varargs ) {
		System.out.println("Hello World...");
	}
}
