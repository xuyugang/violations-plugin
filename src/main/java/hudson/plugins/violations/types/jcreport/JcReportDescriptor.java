package hudson.plugins.violations.types.jcreport;

import hudson.plugins.violations.TypeDescriptor;
import hudson.plugins.violations.parse.AbstractTypeParser;

import java.util.ArrayList;
import java.util.List;

/**
 * The descriptor class for jcreport violations type.
 * http://www.jcoderz.org/fawkez/wiki/JcReport
 *
 * @author Andreas.Mandel@gmail.com
 */
public final class JcReportDescriptor extends TypeDescriptor {

    public static final String JCREPORT = "jcreport";

    public JcReportDescriptor() {
        super(JCREPORT);
    }

    /**
     * Create a parser for the jcreport type.
     *
     * @return a new jcreport parser.
     */
    @Override
    public AbstractTypeParser createParser() {
        return new JcReportParser();
    }

    /**
     * Get a list of target xml files to look for for this particular type.
     *
     * @return a list filenames to look for in the target target directory.
     */
    @Override
    public List<String> getMavenTargets() {
        List<String> ret = new ArrayList<String>();
        ret.add("jcoderz-report.xml");
        return ret;
    }
}
