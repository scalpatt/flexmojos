/**
 * Flexmojos is a set of maven goals to allow maven users to compile, optimize and test Flex SWF, Flex SWC, Air SWF and Air SWC.
 * Copyright (C) 2008-2012  Marvin Froeder <marvin@flexmojos.net>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package info.flexmojos.compile.test.report;

import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@XStreamAlias( "testsuite" )
public class TestCaseReport
{

    @XStreamAsAttribute
    private int errors;

    @XStreamAsAttribute
    private int failures;

    @XStreamImplicit( itemFieldName = "testcase" )
    private List<TestMethodReport> methods;

    @XStreamAsAttribute
    private String name;

    @XStreamAsAttribute
    private int tests;

    @XStreamAsAttribute
    private double time;

    public int getErrors()
    {
        return errors;
    }

    public int getFailures()
    {
        return failures;
    }

    public List<TestMethodReport> getMethods()
    {
        return methods;
    }

    public String getName()
    {
        return name;
    }

    public int getTests()
    {
        return tests;
    }

    public double getTime()
    {
        return time;
    }

    public void setErrors( int errors )
    {
        this.errors = errors;
    }

    public void setFailures( int failures )
    {
        this.failures = failures;
    }

    public void setMethods( List<TestMethodReport> methods )
    {
        this.methods = methods;
    }

    public void setName( String name )
    {
        this.name = name;
    }

    public void setTests( int tests )
    {
        this.tests = tests;
    }

    public void setTime( double time )
    {
        this.time = time;
    }

}