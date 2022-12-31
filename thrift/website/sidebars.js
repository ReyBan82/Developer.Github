/**
 * Copyright (c) Meta Platforms, Inc. and affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * @format
 */

/** ABOUT SIDEBARS
 * This sidebar contains custom TOC structure for pages under the `doc` folder
 * It's intended to provide browsing experiences for external users (aka: outside of Meta)
 * To update sidebars related to the internally facing TOC (aka: Meta Users), see
 * `website/fb/sidebars.js` file
 */

const {fbContent, fbInternalOnly} = require('docusaurus-plugin-internaldocs-fb/internal');

module.exports = {
  ghSidebar: [
    'intro',
    ...fbInternalOnly([
    {
      type: 'category',
      label: 'Quick Start',
      link: {
        type: 'doc',
        id: 'fb/quick-start/index',
      },
      items: [
        'fb/quick-start/java',
        'fb/quick-start/python'
      ]
    },
    {
      type: 'category',
      label: 'How To',
      link: {
        type: 'doc',
        id: "fb/howtos/index",
      },
      items: [
        'fb/howtos/using-a-client',
        {
          type: 'category',
          label: 'Implementing a Server',
          link: {
            type: 'doc',
            id: "fb/howtos/implementing-a-server/index",
          },
          items: [
            'fb/howtos/implementing-a-server/cpp',
            'fb/howtos/implementing-a-server/java'
          ]
        },
        'fb/howtos/calling-python-from-hack'
      ]
    }]),
    {
      type: 'category',
      label: 'Specification',
      link: {
        type: 'doc',
        id: 'spec/index'
      },
      items: [
        "spec/about",
        {
          type: 'category',
          label: 'Interface Definition Language',
          link: {
            type: 'doc',
            id: 'spec/idl/index',
          },
          items: [
            "spec/idl/idl-reference",
            "spec/idl/field-qualifiers",
            "spec/idl/structured-annotations",
            "spec/idl/standard-thrift-annotation-library",
            "spec/idl/mixins",
            "spec/idl/schema-evolution"
          ]
        },
        {
          type: 'category',
          label: 'Definitions',
          link: {
            type: 'doc',
            id: 'spec/definition/index',
          },
          items: [
            "spec/definition/interface",
            "spec/definition/program",
            "spec/definition/data",
            "spec/definition/exception",
            "spec/definition/compatibility",
            "spec/definition/tolerance",
            "spec/definition/value",
            "spec/definition/annotation",
          ]
        },
        {
          type: 'category',
          label: 'Protocols',
          link: {
            type: 'doc',
            id: 'spec/protocol/index',
          },
          items: [
            "spec/protocol/channel",
            "spec/protocol/data",
            {
              type: 'category',
              label: 'Interface Protocol',
              link: {
                type: 'doc',
                id: 'spec/protocol/interface/index'
              },
              items: [
                "spec/protocol/interface/rocket"
              ]
            }
          ]
        },
      ]
    },
    {
      type: 'category',
      label: 'Features',
      link: {
        type: 'doc',
        id: 'features/index',
      },
      items: [
        // Features are added to the features/ folder as a flat list so that
        // they can be moved in and out of beta/experimental state without
        // affecting their URLs.

        // Released features:
        'fb/features/serialization',
        {
          type: 'category',
          label: 'Streaming',
          link: {
            type: 'doc',
            id: "fb/features/streaming/index",
          },
          items: [
            'fb/features/streaming/sink',
            'fb/features/streaming/java',
            'fb/features/streaming/multicasting'
          ]
        },
        'fb/features/interactions',

        // Beta features:
        {
          Beta: [
            ...fbInternalOnly(['fb/features/adapters']),
            'features/any',
          ]
        },
        // Experimental features:
        {
          Experimental: [
            'features/hash',
            'features/patch',
            'features/schema',
            'features/yaml',
            ...fbInternalOnly(['fb/features/metadata']),
          ]
        }
      ]
    },
    {
      type: 'category',
      label: 'Languages',
      link: {
        type: 'doc',
        id: "languages/index",
      },
      collapsible: true,
      collapsed: true,
      items: [
        {
          type: 'category',
          label: 'C++',
          link: {
            type: 'doc',
            id: "languages/cpp/index",
          },
          items: [
            ...fbInternalOnly([
            'fb/languages/cpp/generated-code',
            'fb/languages/cpp/field-access',
            'fb/languages/cpp/isset-bitpacking',
            {
              type: 'category',
              label: 'CodeFrameworks',
              link: {
                type: 'doc',
                id: "fb/languages/cpp/code-frameworks/index",
              },
              items: [
                'fb/languages/cpp/code-frameworks/binary-contracts',
                'fb/languages/cpp/code-frameworks/migration'
              ]
            },
            'languages/cpp/channel',
            'languages/cpp/cpp2',
            'fb/languages/cpp/serialization',
            'fb/languages/cpp/visitation',
            'fb/languages/cpp/hash',
            'fb/languages/cpp/lazy',
            'fb/languages/cpp/protocol-object',
            {
              type: 'category',
              label: 'Frozen2',
              link: {
                type: 'doc',
                id: "fb/languages/cpp/frozen2/index",
              },
              items: [
                'fb/languages/cpp/frozen2/frozen'
              ]
            }
            ])
          ]
        },
        ...fbInternalOnly([
        {
          type: 'category',
          label: 'Hack',
          link: {
            type: 'doc',
            id: "fb/languages/hack/index",
          },
          items: [
            'fb/languages/hack/adding-updating',
            'fb/languages/hack/adding-new-files',
            'fb/languages/hack/auto-sync-for-existing-thrift-files',
            {
              type: 'category',
              label: 'Updating the thrift compiler in www',
              link: {
                type: 'doc',
                id: "fb/languages/hack/updating-the-thrift-compiler-in-www/index",
              },
              items: [
                'fb/languages/hack/updating-the-thrift-compiler-in-www/repo-lock',
              ]
            },
            'fb/languages/hack/adding-graphql-and-jsenum-support',
            {
              type: 'category',
              label: 'Using Thrift Clients',
              link: {
                type: 'doc',
                id: "fb/languages/hack/clients/index",
              },
              items: [
                'fb/languages/hack/clients/streaming',
                'fb/languages/hack/clients/sink',
              ]
            },
            {
              type: 'category',
              label: 'WWW Thrift Services',
              link: {
                type: 'doc',
                id: "fb/languages/hack/servers/index",
              },
              items: [
                'fb/languages/hack/servers/sr-setup',
              ]
            },
            'fb/languages/hack/example-of-thrift-clients-in-www',
            'fb/languages/hack/testing-serialization-changes'
          ]
        },
        {
          type: 'category',
          label: 'Java',
          link: {
            type: 'doc',
            id: "fb/languages/java/index",
          },
          items: [
            'fb/languages/java/hyperthrift'
          ]
        },
        {
          type: 'category',
          label: 'Python',
          link: {
            type: 'doc',
            id: "fb/languages/python/index",
          },
          items: [
            'fb/languages/python/code-frameworks'
          ]
        }
        ])
      ]
    },
    ...fbInternalOnly([
    {
      type: 'category',
      label: 'Compiler',
      link: {
        type: 'doc',
        id: "fb/compiler/index",
      },
      items: [
        'fb/compiler/buck',
      ]
    },
    {
      type: 'category',
      label: 'Server',
      link: {
        type: 'doc',
        id: "fb/server/index",
      },
      items: [
        'fb/server/components',
        'fb/server/transport',
        'fb/server/threading-models',
        'fb/server/thrift-server-features',
        'fb/server/async-handling',
        'fb/server/resource-pools',
        'fb/server/configuration',
        {
          type: 'category',
          label: 'Workload prioritization and isolation',
          link: {
            type: 'doc',
            id: 'fb/server/prio-and-isolation/index',
          },
          items: [
            'fb/server/prio-and-isolation/isolation-via-the-sfq-thread-manager',
            'fb/server/prio-and-isolation/priorities-reference'
          ]
        },
        {
          type: 'category',
          label: 'Overload Protection',
          link: {
            type: 'doc',
            id: 'fb/server/overload-protection/index',
          },
          items: [
            'fb/server/overload-protection/cpuconcurrencycontroller',
            'fb/server/overload-protection/adaptive-concurrency',
            'fb/server/overload-protection/queue-timeouts'
          ]
        }
      ]
    },
    {
      type: 'category',
      label: 'Testing',
      link: {
        type: 'doc',
        id: "fb/testing/index",
      },
      items: [
        'fb/testing/loadgen',
        'fb/testing/stress-test-framework',
      ]
    },
    {
      type: 'category',
      label: 'Best Practices',
      link: {
        type: 'doc',
        id: "fb/best-practices/index",
      },
      items: [
        'best-practices/style-guide',
        'fb/best-practices/code-modernization',
        {
          type: 'category',
          label: 'You don\'t need FacebookBase2!',
          link: {
            type: 'doc',
            id: "fb/best-practices/you-dont-need-facebookbase2/index",
          },
          items: [
            'fb/best-practices/you-dont-need-facebookbase2/facebookbase2-deprecation-bootcamp-instructions',
            'fb/best-practices/you-dont-need-facebookbase2/facebookbase2-deprecation-migration-bootcamp-tasks-oncall-runbook',
            'fb/best-practices/you-dont-need-facebookbase2/facebookbase2-deprecation-migration'
          ]
        },
        'fb/best-practices/migrating-javadeprecated-to-java-swift'
      ]
    },
    {
      type: 'category',
      label: 'Troubleshooting',
      link: {
        type: 'doc',
        id: "fb/troubleshooting/index",
      },
      items: [
        'fb/troubleshooting/faq',
        {
          type: 'category',
          label: 'Exception Handling',
          link: {
            type: 'doc',
            id: "fb/troubleshooting/exception-handling/index",
          },
          items: [
            'fb/troubleshooting/exception-handling/error-classification',
          ]
        },
        'fb/troubleshooting/debugging-tools',
        'fb/troubleshooting/fuzzer',
        {
          type: 'category',
          label: 'Dogpiles',
          link: {
            type: 'doc',
            id: "fb/troubleshooting/dogpiles/index",
          },
          items: [
            'fb/troubleshooting/dogpiles/io',
          ]
        },
        'fb/troubleshooting/fb303-counters'
      ]
    }
    ]),
    {
      type: 'category',
      label: 'Releases',
      link: {
        type: 'doc',
        id: "releases/index",
      },
      items: [
        'releases/release-notes-v1',
      ]
    },

    // Documentation for the Thrift team and contributors.
    {
      type: 'category',
      label: 'Contributions',
      link: {
        type: 'doc',
        id: "contributions/index",
      },
      items: [
        ...fbInternalOnly([
        {
          type: 'category',
          label: 'Thrift Core',
          link: {
            type: 'doc',
            id: "fb/contributions/thrift-core/index",
          },
          items: [
            {
              type: 'autogenerated',
              dirName: "fb/contributions/thrift-core"
            }
          ]
        },
        'fb/contributions/flags',
        'fb/contributions/server-logging',
        'fb/contributions/syncing-annotation-library',
        'fb/contributions/jemalloc-profiling-on-server',
        {
          type: 'category',
          label: 'ContextProp',
          link: {
            type: 'doc',
            id: "fb/contributions/contextprop/index",
          },
          items: [
            'fb/contributions/contextprop/testing',
            'fb/contributions/contextprop/design-and-implementation',
            'fb/contributions/contextprop/extending-fields'
          ]
        },
        'fb/contributions/thrift-repos',
        'fb/contributions/internal-server-logging',
        'fb/contributions/pcap-logging',
        'fb/contributions/regression-test',
        'fb/contributions/rocket-rollout-configs',
        'fb/contributions/runbook',
        'fb/contributions/test-coverage',
        'fb/contributions/testing-dogpiles-locally',
        'fb/contributions/compiler',
        'fb/contributions/linter',
        'fb/contributions/oss',
        'fb/contributions/troubleshooting',
        'fb/contributions/xplat',
        ]),
        'contributions/conformance/index',
        {
          type: 'category',
          label: 'Test Suite',
          link: {
            type: 'doc',
            id: "contributions/conformance/testsuite/index",
          },
          items: [
            'contributions/conformance/testsuite/data',
            'contributions/conformance/testsuite/client-rpc',
            'contributions/conformance/testsuite/server-rpc',
          ]
        },
        {
          type: 'category',
          label: 'Documentation',
          link: {
            type: 'doc',
            id: "contributions/documentation/index",
          },
          items: [
          'contributions/documentation/site-structure',
          'contributions/documentation/local-preview',
        ]},
      ]
    },

    'glossary'
  ]
};
